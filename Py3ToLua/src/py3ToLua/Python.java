
package py3ToLua;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author camiloasc1
 *
 */
public class Python
{
    private static Map<String, String> pyLib;
    static
    {
        pyLib = new LinkedHashMap<String, String>();

        pyLib.put("abs", "math.abs");
        pyLib.put("all", null);
        pyLib.put("any", null);
        pyLib.put("basestring", null);
        pyLib.put("bin", null);
        pyLib.put("bool", null);
        pyLib.put("bytearray", null);
        pyLib.put("callable", null);
        pyLib.put("chr", null);
        pyLib.put("classmethod", null);
        pyLib.put("cmp", null);
        pyLib.put("compile", "loadfile");
        pyLib.put("complex", null);
        pyLib.put("delattr", null);
        pyLib.put("dict", "table");
        pyLib.put("dir", null);
        pyLib.put("divmod", "math.fmod");
        pyLib.put("enumerate", "pairs");
        pyLib.put("eval", "dofile");
        pyLib.put("execfile", "loadfile");
        pyLib.put("file", "loadfile");
        pyLib.put("filter", null);
        pyLib.put("float", null);
        pyLib.put("format", null);
        pyLib.put("frozenset", null);
        pyLib.put("getattr", null);
        pyLib.put("globals", null);
        pyLib.put("hasattr", null);
        pyLib.put("hash", null);
        pyLib.put("help", null);
        pyLib.put("hex", null);
        pyLib.put("id", null);
        pyLib.put("input", "io.read");
        pyLib.put("int", null);
        pyLib.put("isinstance", null);
        pyLib.put("issubclass", null);
        pyLib.put("iter", null);
        pyLib.put("len", "#");
        pyLib.put("list", null);
        pyLib.put("locals", null);
        pyLib.put("long", "#");
        pyLib.put("map", null);
        pyLib.put("max", "math.max");
        pyLib.put("memoryview", null);
        pyLib.put("min", "math.min");
        pyLib.put("next", "next");
        pyLib.put("object", null);
        pyLib.put("oct", null);
        pyLib.put("open", null);
        pyLib.put("ord", null);
        pyLib.put("pow", "math.pow");
        pyLib.put("print", "print");
        pyLib.put("property", null);
        pyLib.put("range", "");
        pyLib.put("raw_input", null);
        pyLib.put("reduce", null);
        pyLib.put("reload", null);
        pyLib.put("repr", null);
        pyLib.put("reversed", "table.reverse");
        pyLib.put("round", "math.floor");
        pyLib.put("set", null);
        pyLib.put("setattr", null);
        pyLib.put("slice", null);
        pyLib.put("sorted", "table.sort");
        pyLib.put("staticmethod", null);
        pyLib.put("str", null);
        pyLib.put("sum", null);
        pyLib.put("super", null);
        pyLib.put("tuple", null);
        pyLib.put("type", null);
        pyLib.put("unichr", null);
        pyLib.put("unicode", null);
        pyLib.put("vars", null);
        pyLib.put("xrange", null);
        pyLib.put("zip", null);
    }

    public static boolean isFunction(String function)
    {
        return pyLib.containsKey(function);
    }

    public static String functionTrad(String function)
    {
        return pyLib.get(function);
    }
}
