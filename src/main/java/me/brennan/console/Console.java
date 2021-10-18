package me.brennan.console;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @author Brennan
 * @since 10/18/2021
 **/
public class Console {

    public static boolean setTitle(String title) {
       return Kernel32.INSTANCE.SetConsoleTitleA(title);
    }

    private interface Kernel32 extends Library {
        Kernel32 INSTANCE = Native.load("kernel32", Kernel32.class);

        boolean SetConsoleTitleA(String title);
    }
}
