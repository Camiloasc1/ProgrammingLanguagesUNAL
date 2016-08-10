
package luaToPy3;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author camiloasc1
 *
 */
public class Lua
{
    private static Map<String, Map<String, String>> luaLib;
    static
    {
        luaLib = new LinkedHashMap<String, Map<String, String>>();
        Map<String, String> lib;

        lib = new LinkedHashMap<String, String>();
        lib.put("assert", "assert");
        lib.put("collectgarbage", null);
        lib.put("dofile", "exec");
        lib.put("error", "raise Exception");
        lib.put("getmetatable", null);
        lib.put("ipairs", "enumerate");
        lib.put("load", null);// "exec"
        lib.put("loadfile", null);// "exec"
        lib.put("next", "next");// ".next()"
        lib.put("pairs", null);// ".iteritems()"
        lib.put("pcall", null);// function call
        lib.put("print", "print");
        lib.put("rawequal", null);// "=="
        lib.put("rawget", null);// table.get
        lib.put("rawlen", "len");
        lib.put("rawset", null);// table.set
        lib.put("require", null);// Import
        lib.put("select", null);// Like sliced in vararg
        lib.put("setmetatable", null);
        lib.put("tonumber", "int");
        lib.put("tostring", "str");
        lib.put("type", "type");
        lib.put("xpcall", null);
        luaLib.put(null, lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("create", null);
        lib.put("isyieldable", null);
        lib.put("resume", null);
        lib.put("running", null);
        lib.put("status", null);
        lib.put("wrap", null);
        lib.put("yield", null);
        luaLib.put("coroutine", lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("debug", null);
        lib.put("gethook", null);
        lib.put("getinfo", null);
        lib.put("getlocal", null);
        lib.put("getmetatable", null);
        lib.put("getregistry", null);
        lib.put("getupvalue", null);
        lib.put("getuservalue", null);
        lib.put("sethook", null);
        lib.put("setlocal", null);
        lib.put("setmetatable", null);
        lib.put("setupvalue", null);
        lib.put("setuservalue", null);
        lib.put("traceback", null);
        lib.put("upvalueid", null);
        lib.put("upvaluejoin", null);
        luaLib.put("debug", lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("close", null);
        lib.put("flush", null);
        lib.put("input", null);
        lib.put("lines", null);
        lib.put("open", null);
        lib.put("output", null);
        lib.put("popen", null);
        lib.put("read", "input");
        lib.put("stderr", null);
        lib.put("stdin", null);
        lib.put("stdout", null);
        lib.put("tmpfile", null);
        lib.put("type", null);
        lib.put("write", "print");
        luaLib.put("io", lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("close", null);
        lib.put("flush", null);
        lib.put("lines", null);
        lib.put("read", null);
        lib.put("seek", null);
        lib.put("setvbuf", null);
        lib.put("write", null);
        luaLib.put("file", lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("abs", "math.fabs");
        lib.put("acos", "math.acos");
        lib.put("asin", "math.asin");
        lib.put("atan", "math.atan");
        lib.put("ceil", "math.ceil");
        lib.put("cos", "math.cos");
        lib.put("deg", "math.degrees");
        lib.put("exp", "math.exp");
        lib.put("floor", "math.floor");
        lib.put("fmod", "math.fmod");
        lib.put("huge", null);
        lib.put("log", "math.log");
        lib.put("max", "max");
        lib.put("maxinteger", null);
        lib.put("min", "min");
        lib.put("mininteger", null);
        lib.put("modf", "math.modf");
        lib.put("pi", "math.pi");
        lib.put("rad", "math.radians");
        lib.put("random", "random.random");
        lib.put("randomseed", "random.seed");
        lib.put("sin", "math.sin");
        lib.put("sqrt", "math.sqrt");
        lib.put("tan", "math.tan");
        lib.put("tointeger", "int");
        lib.put("type", "type");
        lib.put("ult", null);
        luaLib.put("math", lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("clock", null);
        lib.put("date", null);
        lib.put("difftime", null);
        lib.put("execute", null);
        lib.put("exit", null);
        lib.put("getenv", null);
        lib.put("remove", null);
        lib.put("rename", null);
        lib.put("setlocale", null);
        lib.put("time", null);
        lib.put("tmpname", null);
        luaLib.put("os", lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("config", null);
        lib.put("cpath", null);
        lib.put("loaded", null);
        lib.put("loadlib", null);
        lib.put("path", null);
        lib.put("preload", null);
        lib.put("searchers", null);
        lib.put("searchpath", null);
        luaLib.put("package", lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("byte", null);
        lib.put("char", "chr");
        lib.put("dump", null);
        lib.put("find", null);
        lib.put("format", "format");
        lib.put("gmatch", null);
        lib.put("gsub", null);
        lib.put("len", "len");
        lib.put("lower", null);
        lib.put("match", null);
        lib.put("pack", null);
        lib.put("packsize", null);
        lib.put("rep", null);
        lib.put("reverse", "reversed");
        lib.put("sub", null);
        lib.put("unpack", null);
        lib.put("upper", null);
        luaLib.put("string", lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("concat", null);
        lib.put("insert", null);
        lib.put("move", null);
        lib.put("pack", null);
        lib.put("remove", null);
        lib.put("sort", null);
        lib.put("unpack", null);
        luaLib.put("table", lib);

        lib = new LinkedHashMap<String, String>();
        lib.put("char", null);
        lib.put("charpattern", null);
        lib.put("codepoint", null);
        lib.put("codes", null);
        lib.put("len", null);
        lib.put("offset", null);
        luaLib.put("utf8", lib);

    }

    public static boolean isLib(String lib)
    {
        return luaLib.containsKey(lib);
    }

    public static boolean isFunction(String function)
    {
        return isFunction(null, function);
    }

    public static boolean isFunction(String lib, String function)
    {
        return luaLib.get(lib).containsKey(function);
    }

    public static String functionTrad(String function)
    {
        return functionTrad(null, function);
    }

    public static String functionTrad(String lib, String function)
    {
        return luaLib.get(lib).get(function);
    }
}
