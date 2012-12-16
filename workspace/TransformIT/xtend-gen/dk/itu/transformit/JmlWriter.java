package dk.itu.transformit;

import SimplifiedJML.SimplifiedJMLModel;
import SimplifiedJML.Structure;
import com.google.common.base.Objects;
import com.google.inject.Guice;
import com.google.inject.Injector;
import dk.itu.simplifiedjml.TomatoRuntimeModule;
import java.io.File;
import java.io.FileWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.parsetree.reconstr.Serializer;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class JmlWriter implements IWorkflowComponent {
  private String _slot;
  
  public String getSlot() {
    return this._slot;
  }
  
  public void setSlot(final String slot) {
    this._slot = slot;
  }
  
  private String _path;
  
  public String getPath() {
    return this._path;
  }
  
  public void setPath(final String path) {
    this._path = path;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    try {
      String _slot = this.getSlot();
      Object _get = ctx.get(_slot);
      final SimplifiedJMLModel model = ((SimplifiedJMLModel) _get);
      TomatoRuntimeModule _tomatoRuntimeModule = new TomatoRuntimeModule();
      final Injector injector = Guice.createInjector(_tomatoRuntimeModule);
      final Serializer serializer = injector.<Serializer>getInstance(Serializer.class);
      EList<Structure> _structures = model.getStructures();
      for (final Structure structure : _structures) {
        {
          String _path = this.getPath();
          String _name = structure.getName();
          String _plus = (_name + ".simplejml");
          File _file = new File(_path, _plus);
          final File file = _file;
          File _parentFile = file.getParentFile();
          boolean _notEquals = (!Objects.equal(_parentFile, null));
          if (_notEquals) {
            File _parentFile_1 = file.getParentFile();
            _parentFile_1.mkdirs();
          }
          FileWriter _fileWriter = new FileWriter(file);
          final FileWriter writer = _fileWriter;
          SaveOptions _defaultOptions = SaveOptions.defaultOptions();
          serializer.serialize(structure, writer, _defaultOptions);
        }
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}
