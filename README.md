Maven Practical Assignment: Development of a Library for Working with Geometric Shapes

This repository contains:
- `GeometryLibrary`: the final library project
- `GeometryApp`: the final application project
- `Stages`: step-by-step snapshots that preserve the exact required version progression from the assignment

Final Projects

- `GeometryLibrary` is the final upgraded library state.
- `GeometryApp` is the final upgraded application state that uses:
  - `geometry-core`
  - `GeometryUtils`
  - `ThreeDimensionalShapes`

Assignment Progression

The `Stages` folder preserves the required steps exactly:
1. `01-GeometryLibrary-1.0.0`
2. `02-GeometryLibrary-1.1.0`
3. `03-GeometryUtils-1.0.0-SNAPSHOT`
4. `04-GeometryUtils-1.1.0-SNAPSHOT`
5. `05-ThreeDimensionalShapes-1.0.0-SNAPSHOT`
6. `06-ThreeDimensionalShapes-1.1.0-SNAPSHOT`

How To Build

Build the library first:

```powershell
cd GeometryLibrary
mvn clean install
```

Then build the application:

```powershell
cd ..\GeometryApp
mvn clean package
```

How To Run

Run the final application from `GeometryApp`:

```powershell
java -cp "target\classes;C:\Users\shraddha\.m2\repository\com\example\geometry\geometry-core\1.1.0\geometry-core-1.1.0.jar;C:\Users\shraddha\.m2\repository\com\example\geometry\GeometryUtils\1.1.0-SNAPSHOT\GeometryUtils-1.1.0-SNAPSHOT.jar;C:\Users\shraddha\.m2\repository\com\example\geometry\ThreeDimensionalShapes\1.1.0-SNAPSHOT\ThreeDimensionalShapes-1.1.0-SNAPSHOT.jar" com.example.geometry.app.GeometryApplication
```

Expected Output

```text
Two-dimensional shapes
Circle -> area: 78.54, perimeter: 31.42
Rectangle -> area: 24.00, perimeter: 20.00
Triangle -> area: 6.00, perimeter: 12.00

Utility operations
12.70 cm in inches: 5.00
Circle has a larger area than Rectangle.
Perimeter comparison result (circle vs rectangle): 1

Three-dimensional shapes
Cube -> surface area: 54.00, volume: 27.00
Sphere -> surface area: 78.54, volume: 65.45
```

Version Summary

- `GeometryLibrary`: `1.1.0`
- `GeometryUtils`: `1.1.0-SNAPSHOT`
- `ThreeDimensionalShapes`: `1.1.0-SNAPSHOT`

Dependency Conflict Resolution

The assignment asked to update module versions and resolve dependency conflicts. This is handled in `GeometryApp/pom.xml` using `dependencyManagement`.

That means:
- the final versions are declared in one place
- all dependencies use the same coordinated versions
- version drift is avoided when modules depend on one another transitively

This is the Maven mechanism used in the submission to resolve the conflict-management part of the task.
