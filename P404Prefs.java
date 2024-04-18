public class Main {
    public static void main(String[] args) {
        int length = 5;

        int prefsToInit = getPrefsToInit("21");
        System.out.println(String.format("prefsToInit = %d", prefsToInit));

        for (int i = 0; i < length; i++) {
            int exp = (int) Math.pow(2, i);
            boolean shouldInit = (exp & prefsToInit) != 0;
            System.out.println(String.format(
                    "\nexp = %d\nshouldInit = %b", exp, shouldInit));
            if (!shouldInit) continue;

            System.out.println(String.format("Init preference %d", i));
        }
    }

    private static int getPrefsToInit(String defaultValue) {
        return Integer.parseInt(getSystemProperty(
                "persist.sys.launcher.prefs_to_init", defaultValue));
    }

    private static String getSystemProperty(String property,
            String defaultValue) {
        return defaultValue;
    }
}
