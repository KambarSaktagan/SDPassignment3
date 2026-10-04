# Assignment 3: Bridge Pattern

- **Student:** Kambar Saktagan
- **Group:** SE-2522
- **Topic:** Option A (Drawing)

---

## Role Map

| Role | Class / Interface | Source Path |
| :--- | :--- | :--- |
| **Abstraction** | `Shape` | `src/Shape.java` |
| **Refined Abstraction 1 (A1)** | `Circle` | `src/Circle.java` |
| **Refined Abstraction 2 (A2)** | `Square` | `src/Square.java` |
| **Implementor** | `Renderer` | `src/Renderer.java` |
| **Concrete Implementor 1 (I1)** | `VectorRenderer` | `src/VectorRenderer.java` |
| **Concrete Implementor 2 (I2)** | `RasterRenderer` | `src/RasterRenderer.java` |
| **Concrete Implementor 3 (I3)** | `AsciiRenderer` | `src/AsciiRenderer.java` |
| **Client** | `Main` | `src/Main.java` |

- **Bridge Field Reference:** `Shape.renderer` (protected interface reference)
- **Operation Execution:** `Shape.execute()`
- **Runtime Switch Method:** `Shape.setImplementation(Renderer renderer)`
- **Runtime Identity Verification (T5):** `src/Main.java` (lines 32–45)

---

## Build and Run Instructions

Execute the following commands from the root directory to compile and run without IDE dependencies:

```bash
# Compile via standard release 17
javac --release 17 -encoding UTF-8 -d out "@sources.txt"

# Run automated verification suite
java -cp out Main --demo
