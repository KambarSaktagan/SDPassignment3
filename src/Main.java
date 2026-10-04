public class Main {
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("--demo")) {
            runTests();
        }
    }

    private static void runTests() {
        int passed = 0;

        // T1: A1 with I1
        Shape c1 = new Circle("C1", new VectorRenderer());
        String t1 = c1.execute();
        passed += check("T1", t1.equals("VECTOR circle radius i=2"), "Circle + VectorRenderer", t1);

        // T2: A1 with I2
        Shape c2 = new Circle("C2", new RasterRenderer());
        String t2 = c2.execute();
        passed += check("T2", t2.equals("RASTER circle radius i=2"), "Circle + RasterRenderer", t2);

        // T3: A2 with I1
        Shape s1 = new Square("S1", new VectorRenderer());
        String t3 = s1.execute();
        passed += check("T3", t3.equals("VECTOR square side i=3"), "Square + VectorRenderer", t3);

        // T4: A2 with I2
        Shape s2 = new Square("S2", new RasterRenderer());
        String t4 = s2.execute();
        passed += check("T4", t4.equals("RASTER square side i=3"), "Square + RasterRenderer", t4);

        // T5: Runtime Switch
        Shape switchShape = new Circle("C_SWITCH", new VectorRenderer());
        Shape originalRef = switchShape;
        String before = switchShape.execute();

        switchShape.setImplementation(new RasterRenderer());
        String after = switchShape.execute();

        boolean sameObject = (originalRef == switchShape);
        boolean stateUnchanged = switchShape.getId().equals("C_SWITCH");
        boolean isPass = sameObject && stateUnchanged && before.equals("VECTOR circle radius i=2") && after.equals("RASTER circle radius i=2");

        System.out.println("T5 " + (isPass ? "PASS" : "FAIL") + " sameObject=" + sameObject + " | stateUnchanged=" + stateUnchanged);
        System.out.println("before=" + before + " | after=" + after);
        if (isPass) passed++;

        // T6: A1 with I3 (Extension)
        Shape c3 = new Circle("C3", new AsciiRenderer());
        String t6 = c3.execute();
        passed += check("T6", t6.equals("ASCII circle radius i=2"), "Circle + AsciiRenderer", t6);

        // T7: A2 with I3 (Extension)
        Shape s3 = new Square("S3", new AsciiRenderer());
        String t7 = s3.execute();
        passed += check("T7", t7.equals("ASCII square side i=3"), "Square + AsciiRenderer", t7);

        System.out.println("SUMMARY: " + passed + "/7 PASS");
    }

    private static int check(String id, boolean pass, String classes, String actual) {
        System.out.println(id + " " + (pass ? "PASS" : "FAIL") + " | " + classes + " | result=" + actual);
        return pass ? 1 : 0;
    }
}