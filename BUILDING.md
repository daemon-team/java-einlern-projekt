## Java Projekt bauen

Um das Java Projekt zu bauen, braucht man folgendes:
* Zugang zum Repository: "java-einlern-projekt"
* OpenJDK version: 11+

### Starten des GradleW

Es ist nicht nötig Gradle manuell zu installieren,da Gradle ein Tool names "Gradle Wrapper" hat, mit dem ist es möglich Gradle zu starten.

Bevor jedoch man das Tool überhaupt starten kann, muss man das Repo 'java-einlern-projekt' klonen:
```
git clone (repo-link)
```
Sobald das Repo angelegt ist, kann man den 'Gradle Wrapper' starten:
```
./gradlew build
```
Wenn man folgende Ausgabe erhält hat man bis hier her alles richtig gemacht:
```
mdogan@meeting-laptop:~/Git/java-einlern-projekt$ ./gradlew

> Task :help

Welcome to Gradle 7.6.

To run a build, run gradlew <task> ...

To see a list of available tasks, run gradlew tasks

To see more detail about a task, run gradlew help --task <task>

To see a list of command-line options, run gradlew --help

For more detail on using Gradle, see https://docs.gradle.org/7.6/userguide/command_line_interface.html

For troubleshooting, visit https://help.gradle.org

BUILD SUCCESSFUL in 1s
1 actionable task: 1 executed
```
Nachdem das abgeschlossen ist, kann das Java Projekt ausgeführt werden:
```
./gradlew run
```
In meinem Projekt werden auch noch Startargumente Verlangt, diese werden mit der Option ```--args=""``` mitgegeben.
```
./gradlew run --args="10"
```
Es können bis zu 3 startargumente eingegeben werden, getrennt werden die Startargumente mit einem Leerzeichen
```
./gradlew run --args="10 20 30"
```
