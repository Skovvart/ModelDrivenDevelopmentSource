package dk.itu.transformit;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class ObjectDumper {
	java.util.Set<Object> visited;
	private static class ObjectDumperHolder {
		public static final ObjectDumper INSTANCE = new ObjectDumper();
	}
	
	public static ObjectDumper getDumper() {
		ObjectDumperHolder.INSTANCE.visited.clear();
		return ObjectDumperHolder.INSTANCE;
	}
	
	private ObjectDumper()
	{
		visited = new java.util.HashSet<Object>();
	}
	
	public String dump(Object o) {
		return dump(o, -1);
	}
	
	public String dump(Object o, int depth) {
		int cdepth = 0;
		if (o == null)
			return "null";
		if (visited.contains(o))
			return "...";
		visited.add(o);
	    StringBuffer buffer = new StringBuffer();
	    Class<? extends Object> oClass = o.getClass();
	     if (oClass.isArray()) {
	         buffer.append("Array: ");
	        buffer.append("[");
	        for (int i = 0; i < Array.getLength(o); i++) {
	            Object value = Array.get(o, i);
	            if (    value != null && (
	            		value.getClass().isPrimitive() ||
	                    value.getClass() == java.lang.Long.class ||
	                    value.getClass() == java.lang.Integer.class ||
	                    value.getClass() == java.lang.Boolean.class ||
	                    value.getClass() == java.lang.String.class ||
	                    value.getClass() == java.lang.Short.class ||
	                    value.getClass() == java.lang.Byte.class
	                    )) {
	                buffer.append(value);
	                if(i != (Array.getLength(o)-1)) buffer.append(",");
	            } else {
	                buffer.append(dump(value, depth));
	             }
	        }
	        buffer.append("]\n");
	    } else {
	         buffer.append("Class: " + oClass.getName());
	         buffer.append("{\n");
	        while (oClass != null) {
	            Field[] fields = oClass.getDeclaredFields();
	            for (int i = 0; i < fields.length; i++) {
	                fields[i].setAccessible(true);
	                buffer.append(fields[i].getName());
	                buffer.append("=");
	                try {
	                    Object value = fields[i].get(o);
	                    if (value != null) {
	                        if (value.getClass().isPrimitive() ||
	                                value.getClass() == java.lang.Long.class ||
	                                value.getClass() == java.lang.String.class ||
	                                value.getClass() == java.lang.Integer.class ||
	                                value.getClass() == java.lang.Boolean.class ||
	                                value.getClass() == java.lang.Short.class ||
	                                value.getClass() == java.lang.Byte.class
	                                ) {
	                            buffer.append(value);
	                        } else {
	                            buffer.append(dump(value, depth));
	                        }
	                    }
	                } catch (IllegalAccessException e) {
	                    buffer.append(e.getMessage());
	                }
	                buffer.append("\n");
	            }
	            if (++cdepth != depth)
	            	oClass = oClass.getSuperclass();
	            else
	            	oClass = null;
	        }
	        buffer.append("}\n");
	    }
	    return buffer.toString();
	}
}
