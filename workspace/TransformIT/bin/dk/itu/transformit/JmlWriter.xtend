package dk.itu.transformit

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import SimplifiedJML.SimplifiedJMLModel
import com.google.inject.Guice
import dk.itu.simplifiedjml.TomatoRuntimeModule
import org.eclipse.xtext.parsetree.reconstr.Serializer
import org.eclipse.emf.common.util.URI
import java.io.FileWriter
import org.eclipse.xtext.resource.SaveOptions
import java.io.File
import com.google.common.base.Joiner$MapJoiner

class JmlWriter implements IWorkflowComponent {
	@Property String slot
	@Property String path
	

	override invoke(IWorkflowContext ctx) {
		val model = ctx.get(slot) as SimplifiedJMLModel
		val injector = Guice::createInjector(new TomatoRuntimeModule())
		val serializer = injector.getInstance(typeof(Serializer))
		for (structure : model.structures) {
			val file = new File(path, structure.name + ".simplejml")
			if (file.parentFile != null) {
				file.parentFile.mkdirs()
			}
			val writer = new FileWriter(file)
			serializer.serialize(structure, writer, SaveOptions::defaultOptions)	
		}
	}
	
	override postInvoke() {
	}
	
	override preInvoke() {
	}
	
}