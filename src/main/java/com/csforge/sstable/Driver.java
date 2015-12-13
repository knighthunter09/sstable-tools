package com.csforge.sstable;

import java.util.Arrays;

public class Driver {
    public static void main(String ... args) {
        switch(args[0]) {
            case "sstable2json":
                SSTable2Json.main(Arrays.copyOfRange(args, 1, args.length));
                break;
        }
    }
}
