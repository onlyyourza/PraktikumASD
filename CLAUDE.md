# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## About This Repository

Academic lab assignments for **Praktik Algoritma Struktur Data** (Data Structures & Algorithms Lab), Semester 2. Student: Mafaza Husnadani (group 14). Written in plain Java with no build system.

## Commands

Compile a single file (run from the repo root):
```
javac Jobsheet6/Sorting14.java
java Jobsheet6.Sorting14
```

Compile a package (required when files use `package` declarations and reference each other):
```
javac Jobsheet2/*.java
java Jobsheet2.StudentMain14
```

For `Jobsheet4` which has a sub-package:
```
javac Jobsheet4/BruteForceDivideConquer/*.java
java Jobsheet4.BruteForceDivideConquer.MainFaktorial
```

For `CaseMethod` (no sub-package):
```
javac CaseMethod/*.java
java CaseMethod.Main
```

> Note: `Jobsheet1` files have **no `package` declaration** — compile and run them from inside the `Jobsheet1/` directory, or from the repo root without a package prefix:
> ```
> javac Jobsheet1/Array.java
> java -cp Jobsheet1 Array
> ```

## Repository Structure

Each folder is one lab assignment (jobsheet). The `14` suffix on class names is the student's group number.

| Folder | Topic |
|--------|-------|
| `Jobsheet1` | Java basics — arrays, loops, functions (no package) |
| `Jobsheet2` | OOP fundamentals — Student, MataKuliah, Lecturer classes |
| `Jobsheet3` | OOP with constructors and data arrays; demo classes drive each model |
| `Jobsheet4/BruteForceDivideConquer` | Brute Force vs. Divide & Conquer: Factorial, Power, Sum |
| `Jobsheet6` | Sorting — BubbleSort, SelectionSort, InsertionSort on domain objects |
| `Jobsheet7` | Searching (sequential & binary) and MergeSort |
| `CaseMethod` | Capstone: library lending system combining InsertionSort (by fine) and BinarySearch (by NIM) |
| `Quiz1_MafazaHusnadani_1G` | Quiz: Fashion domain OOP |

## Code Patterns

**Model + Demo split**: From Jobsheet3 onward, each entity has a plain model class (`Student14.java`) and a separate demo/main class (`MahasiswaDemo14.java`) that wires up data arrays and calls methods.

**Algorithm classes**: Sorting and searching logic lives in dedicated classes (`Sorting14`, `SearchStudent`, `MergeSort`) with no `main`; a separate `*Main`/`*Demo` class instantiates them and drives I/O.

**CaseMethod** departs from this — `Main.java` contains both the menu loop and the static `insertionSortDenda` / `binarySearchNim` methods alongside the `BookLending`, `Student`, and `Book` model classes in the same package.

**Mixed language**: Output strings mix Indonesian (`"Nama"`, `"NIM"`, `"Kelas"`) and English depending on the jobsheet. Follow the existing language of the file being edited.
