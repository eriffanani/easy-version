package com.erif.easyversion;

import android.os.Build;

import androidx.annotation.ChecksSdkIntAtLeast;

public class AndroidVersion {
    private static final int SDK = Build.VERSION.SDK_INT;
    // Vanilla
    //private const val VANILLA = Build.VERSION_CODES.VANILLA_ICE_CREAM
    // Upside Down
    private static final int UPSIDE_DOWN = Build.VERSION_CODES.UPSIDE_DOWN_CAKE;
    // Tiramisu
    private static final int TIRAMISU = Build.VERSION_CODES.TIRAMISU;
    // Snow Cone
    private static final int SNOW_CONE = Build.VERSION_CODES.S;
    private static final int SNOW_CONE_L = Build.VERSION_CODES.S_V2;
    // Red Velvet Cake
    private static final int RED_VELVET = Build.VERSION_CODES.R;
    // Quince Tart
    private static final int QUINCE_TART = Build.VERSION_CODES.Q;
    // Pie
    private static final int PIE = Build.VERSION_CODES.P;
    // Oreo
    private static final int OREO = Build.VERSION_CODES.O;
    private static final int OREO_MR1 = Build.VERSION_CODES.O_MR1;
    // Nougat
    private static final int NOUGAT = Build.VERSION_CODES.N;
    private static final int NOUGAT_MR1 = Build.VERSION_CODES.N_MR1;
    // Marshmallow
    private static final int MARSHMALLOW = Build.VERSION_CODES.M;
    // Lollipop
    private static final int LOLLIPOP = Build.VERSION_CODES.LOLLIPOP;
    private static final int LOLLIPOP_MR1 = Build.VERSION_CODES.LOLLIPOP_MR1;

    /*======================================= Vanilla 15 =========================================*/
    /**
     * Read only version Vanilla Ice Cream (Api: 15) - (Code: 35)
     * */
    /*@ChecksSdkIntAtLeast(api = VANILLA, lambda = 0)
    public static boolean Vanilla15() { return SDK == VANILLA; }*/
    /**
     * Read version Vanilla Ice Cream (Android: 15) - (Api: 35) and above
     * */
    /*@ChecksSdkIntAtLeast(api = VANILLA, lambda = 0)
    public static boolean Vanilla15AndUp() { return SDK >= VANILLA; }*/
    /**
     * Read version Vanilla Ice Cream (Android: 15) - (Code: 35) and below
     * */
    /*@ChecksSdkIntAtLeast(api = VANILLA, lambda = 0)
    public static boolean Vanilla15AndDown() { return SDK <= VANILLA; }*/

    /*==================================== Upside Down Cake 14 ===================================*/
    /**
     * Read only version Upside Down Cake (Api: 14) - (Code: 34)
     * */
    @ChecksSdkIntAtLeast(api = UPSIDE_DOWN, lambda = 0)
    public static boolean UpsideDown14() { return SDK == UPSIDE_DOWN; }
    /**
     * Read version Upside Down Cake (Android: 14) - (Api: 34) and above
     * */
    @ChecksSdkIntAtLeast(api = UPSIDE_DOWN, lambda = 0)
    public static boolean UpsideDown14AndUp() { return SDK >= UPSIDE_DOWN; }
    /**
     * Read version Upside Down Cake (Android: 14) - (Code: 34) and below
     * */
    @ChecksSdkIntAtLeast(api = UPSIDE_DOWN, lambda = 0)
    public static boolean UpsideDown14AndDown() { return SDK <= UPSIDE_DOWN; }

    /*====================================== Tiramisu 13 =========================================*/
    /**
     * Read only version Tiramisu (Api: 13) - (Code: 33)
     * */
    @ChecksSdkIntAtLeast(api = TIRAMISU, lambda = 0)
    public static boolean Tiramisu13() { return SDK == TIRAMISU; }
    /**
     * Read version Tiramisu (Android: 13) - (Api: 33) and above
     * */
    @ChecksSdkIntAtLeast(api = TIRAMISU, lambda = 0)
    public static boolean Tiramisu13AndUp() { return SDK >= TIRAMISU; }
    /**
     * Read version Tiramisu (Android: 13) - (Code: 33) and below
     * */
    @ChecksSdkIntAtLeast(api = TIRAMISU, lambda = 0)
    public static boolean Tiramisu13AndDown() { return SDK <= TIRAMISU; }

    /*=================================== Snow Cone 12 And 12L ===================================*/
    /**
     * Read only version Snow Cone L (Api: 12L) - (Code: 32)
     * */
    @ChecksSdkIntAtLeast(api = SNOW_CONE_L, lambda = 0)
    public static boolean Snow12L() { return SDK == SNOW_CONE_L; }
    /**
     * Read version Snow Cone L (Android: 12L) - (Api: 32) and above
     * */
    @ChecksSdkIntAtLeast(api = SNOW_CONE_L, lambda = 0)
    public static boolean Snow12LAndUp() { return SDK >= SNOW_CONE_L; }
    /**
     * Read version Snow Cone L (Android: 12L) - (Api: 32) and below
     * */
    @ChecksSdkIntAtLeast(api = SNOW_CONE_L, lambda = 0)
    public static boolean Snow12LAndDown() { return SDK <= SNOW_CONE_L; }
    /*==================================== Snow Cone 12.0 ========================================*/
    /**
     * Read only version Snow Cone (Api: 12) - (Code: 31)
     * */
    @ChecksSdkIntAtLeast(api = SNOW_CONE, lambda = 0)
    public static boolean Snow12() { return SDK == SNOW_CONE; }
    /**
     * Read version Snow Cone (Android: 12) - (Api: 31) and above
     * */
    @ChecksSdkIntAtLeast(api = SNOW_CONE, lambda = 0)
    public static boolean Snow12AndUp() { return SDK >= SNOW_CONE; }
    /**
     * Read version Snow Cone (Android: 12) - (Api: 31) and below
     * */
    @ChecksSdkIntAtLeast(api = SNOW_CONE, lambda = 0)
    public static boolean Snow12AndDown() { return SDK <= SNOW_CONE; }

    /*===================================== Red Velvet 11 ========================================*/
    /**
     * Read only version Red Velvet (Api: 11) - (Code: 30)
     * */
    @ChecksSdkIntAtLeast(api = RED_VELVET, lambda = 0)
    public static boolean RedVelvet11() { return SDK == RED_VELVET; }
    /**
     * Read version Red Velvet (Android: 11) - (Api: 30) and above
     * */
    @ChecksSdkIntAtLeast(api = RED_VELVET, lambda = 0)
    public static boolean RedVelvet11AndUp() { return SDK >= RED_VELVET; }
    /**
     * Read version Red Velvet (Android: 11) - (Api: 30) and below
     * */
    @ChecksSdkIntAtLeast(api = RED_VELVET, lambda = 0)
    public static boolean RedVelvet11AndDown() { return SDK <= RED_VELVET; }

    /*======================================= Pie 10.0 ===========================================*/
    /**
     * Read only version Quince Tart (Api: 10) - (Code: 29)
     * */
    @ChecksSdkIntAtLeast(api = QUINCE_TART, lambda = 0)
    public static boolean QuinceTart10() { return SDK == QUINCE_TART; }
    /**
     * Read version Quince Tart (Android: 10) - (Api: 29) and above
     * */
    @ChecksSdkIntAtLeast(api = QUINCE_TART, lambda = 0)
    public static boolean QuinceTart10AndUp() { return SDK >= QUINCE_TART; }
    /**
     * Read version Quince Tart (Android: 10) - (Api: 29) and below
     * */
    @ChecksSdkIntAtLeast(api = QUINCE_TART, lambda = 0)
    public static boolean QuinceTart10AndDown() { return SDK <= QUINCE_TART; }

    /*======================================== Pie 9.0 ===========================================*/
    /**
     * Read only version Pie (Api: 9.0) - (Code: 28)
     * */
    @ChecksSdkIntAtLeast(api = PIE, lambda = 0)
    public static boolean Pie9() { return SDK == PIE; }
    /**
     * Read version Pie (Android: 9.0) - (Api: 28) and above
     * */
    @ChecksSdkIntAtLeast(api = PIE, lambda = 0)
    public static boolean Pie9AndUp() { return SDK >= PIE; }
    /**
     * Read version Pie (Android: 9.0) - (Api: 28) and below
     * */
    @ChecksSdkIntAtLeast(api = PIE, lambda = 0)
    public static boolean Pie9AndDown() { return SDK <= PIE; }

    /*===================================== Oreo 8.0 And 8.1 =====================================*/
    /**
     * Read only version Oreo MR1 (Api: 8.1) - (Code: 27)
     * */
    @ChecksSdkIntAtLeast(api = OREO_MR1, lambda = 0)
    public static boolean Oreo8_1() { return SDK == OREO_MR1; }
    /**
     * Read version Oreo MR1 (Android: 8.1) - (Api: 25) and above
     * */
    @ChecksSdkIntAtLeast(api = OREO_MR1, lambda = 0)
    public static boolean Oreo8_1AndUp() { return SDK >= OREO_MR1; }
    /**
     * Read version Oreo MR1 (Android: 8.1) - (Api: 25) and below
     * */
    @ChecksSdkIntAtLeast(api = OREO_MR1, lambda = 0)
    public static boolean Oreo8_1AndDown() { return SDK <= OREO_MR1; }
    /*======================================= Oreo 8.0 ===========================================*/
    /**
     * Read only version Oreo (Api: 8.0) - (Code: 26)
     * */
    @ChecksSdkIntAtLeast(api = OREO, lambda = 0)
    public static boolean Oreo8() { return SDK == OREO; }
    /**
     * Read version Oreo (Android: 8.0) - (Api: 26) and above
     * */
    @ChecksSdkIntAtLeast(api = OREO, lambda = 0)
    public static boolean Oreo8AndUp() { return SDK >= OREO; }
    /**
     * Read version Oreo (Android: 8.0) - (Api: 26) and below
     * */
    @ChecksSdkIntAtLeast(api = OREO, lambda = 0)
    public static boolean Oreo8AndDown() { return SDK <= OREO; }

    /*=================================== Nougat 7.0 And 7.1 =====================================*/
    /**
     * Read only version Nougat MR1 (Api: 7.1) - (Code: 25)
     * */
    @ChecksSdkIntAtLeast(api = NOUGAT_MR1, lambda = 0)
    public static boolean Nougat7_1() { return SDK == NOUGAT_MR1; }
    /**
     * Read version NOUGAT MR1 (Android: 7.1) - (Api: 25) and above
     * */
    @ChecksSdkIntAtLeast(api = NOUGAT_MR1, lambda = 0)
    public static boolean Nougat7_1AndUp() { return SDK >= NOUGAT_MR1; }
    /**
     * Read version NOUGAT MR1 (Android: 7.1) - (Api: 25) and below
     * */
    @ChecksSdkIntAtLeast(api = NOUGAT_MR1, lambda = 0)
    public static boolean Nougat7_1AndDown() { return SDK <= NOUGAT_MR1; }
    /*======================================= Nougat 7.0 =========================================*/
    /**
     * Read only version Nougat (Api: 7.0) - (Code: 24)
     * */
    @ChecksSdkIntAtLeast(api = NOUGAT, lambda = 0)
    public static boolean Nougat7() { return SDK == NOUGAT; }
    /**
     * Read version Nougat (Android: 7.0) - (Api: 24) and above
     * */
    @ChecksSdkIntAtLeast(api = NOUGAT, lambda = 0)
    public static boolean Nougat7AndUp() { return SDK >= NOUGAT; }
    /**
     * Read version Nougat (Android: 7.0) - (Api: 24) and below
     * */
    @ChecksSdkIntAtLeast(api = NOUGAT, lambda = 0)
    public static boolean Nougat7AndDown() { return SDK <= NOUGAT; }

    /*====================================== Marshmallow 6.0 =====================================*/
    /**
     * Read only version Marshmallow (Api: 6.0) - (Code: 23)
     * */
    @ChecksSdkIntAtLeast(api = MARSHMALLOW, lambda = 0)
    public static boolean Marshmallow6() { return SDK == MARSHMALLOW; }
    /**
     * Read version Marshmallow (Android: 6.0) - (Api: 23) and above
     * */
    @ChecksSdkIntAtLeast(api = MARSHMALLOW, lambda = 0)
    public static boolean Marshmallow6AndUp() { return SDK >= MARSHMALLOW; }
    /**
     * Read version Marshmallow (Android: 6.0) - (Api: 23) and below
     * */
    @ChecksSdkIntAtLeast(api = MARSHMALLOW, lambda = 0)
    public static boolean Marshmallow6AndDown() { return SDK <= MARSHMALLOW; }

    /*=================================== Lollipop 5.0 And 5.1 ===================================*/
    /**
     * Read only version Lollipop MR1 (Api: 5.1) - (Code: 22)
     * */
    @ChecksSdkIntAtLeast(api = LOLLIPOP_MR1, lambda = 0)
    public static boolean Lollipop5_1() { return SDK == LOLLIPOP_MR1; }
    /**
     * Read version Lollipop MR1 (Android: 5.1) - (Api: 22) and above
     * */
    @ChecksSdkIntAtLeast(api = LOLLIPOP_MR1, lambda = 0)
    public static boolean Lollipop5_1AndUp() { return SDK >= LOLLIPOP_MR1; }
    /**
     * Read version Lollipop MR1 (Android: 5.1) - (Api: 22) and below
     * */
    @ChecksSdkIntAtLeast(api = LOLLIPOP_MR1, lambda = 0)
    public static boolean Lollipop5_1AndDown() { return SDK <= LOLLIPOP_MR1; }
    /*====================================== Lollipop 5.0 ========================================*/
    /**
     * Read only version Lollipop (Api: 5.0) - (Code: 21)
     * */
    @ChecksSdkIntAtLeast(api = LOLLIPOP, lambda = 0)
    public static boolean Lollipop5() { return SDK == LOLLIPOP; }
    /**
     * Read version Lollipop (Android: 5.0) - (Api: 21) and above
     * */
    @ChecksSdkIntAtLeast(api = LOLLIPOP, lambda = 0)
    public static boolean Lollipop5AndUp() { return SDK >= LOLLIPOP; }
    /**
     * Read version Lollipop (Android: 5.0) - (Api: 21) and below
     * */
    @ChecksSdkIntAtLeast(api = LOLLIPOP, lambda = 0)
    public static boolean Lollipop5AndDown() { return SDK <= LOLLIPOP; }

}
