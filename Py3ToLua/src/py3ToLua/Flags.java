
package py3ToLua;

import java.util.EnumMap;

/**
 * @author camiloasc1
 *
 */
public enum Flags
{
    CLASS,
    NEW,
    RANGEFUNC,
    RANGEFOR,
    ASSIGNOP;
    private static EnumMap<Flags, Boolean> flags = new EnumMap<Flags, Boolean>(Flags.class);

    public static void set(Flags flag)
    {
        flags.put(flag, true);
    }

    public static void clear(Flags flag)
    {
        flags.put(flag, false);
    }

    public static boolean get(Flags flag)
    {
        if (!flags.containsKey(flag))
        {
            clear(flag);
        }
        return flags.get(flag);
    }
}
