## Java Projekt bauen

Um das Java Projekt zu bauen, braucht man folgendes:
* Zugang zum Repository: "java-einlern-projekt"
* OpenJDK version: 11+

### Repo Klonen

Um das Java-Programm überhaupt starten zu können, muss man das Github Repository erstmal klonen.
Dies geschieht mit folgedem Befehl:  
```
git clone git@github.com:daemon-team/java-einlern-projekt.git
```

### Bauen

Das Projekt wird mit Gradle gebaut. Es ist nicht nötig Gradle manuell zu installieren,da Gradle ein Tool names "Gradle Wrapper" hat, mit dem ist es möglich Gradle zu starten.

Sobald das Repo angelegt ist, kann man den 'Gradle Wrapper' starten:
```
./gradlew
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

Nun kann man das Projekt mit folgendem Befehl bauen:
```
./gradlew build
```

### Ausführen

Nach ausführen des Befehls ```./gradlew build``` wird ein Ordner namens "Build" angelegt. In diesem Ordner wird im Unterordner "Classes", die Klassen der Quellcodes abgespeichert.  
Um diese Klassen auszuführen, benutzt man diesen Befehl:    
```
java -cp build/classes/java/main com.daemonspoint.seq.Seq 10
```
Nun sollte man eine Ausgabe sehen.

```
uli-1
uli-2
uli-3
.
.
.
```
Meine Programme können mit bis zu 3 Startargumenten aufgerufen werden.

Dieser Vorgang kann auch mit den anderen .class Dateien durchgespielt werden.
- SeqPause.class
- SeqOutErr.class
- SeqPauseOutErr.class
