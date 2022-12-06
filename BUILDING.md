## Java Projekt bauen

Um das Java Projekt zu bauen, braucht man folgendes:
* Zugang zum Repository: "java-einlern-projekt"
* OpenJDK version: 11+

### Repo Klonen

Um das Java-Programm überhaupt starten zu können, muss man das Github Repository erstmal klonen mit: 
```
git clone (repo-link)
```

### Bauen mit GradleW

Es ist nicht nötig Gradle manuell zu installieren,da Gradle ein Tool names "Gradle Wrapper" hat, mit dem ist es möglich Gradle zu starten.

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

### Bauen ohne GradleW

Nach dem man das Repo geklont hat, muss man das Programm zuerst kompilieren, mit ```javac``` und dem argument ```-d```
Als erstes sollte man zunächst in den Ordner wechseln in dem die QuellCodes sind.(src/main/java/com/daemonspoint/seq)  
Im Terminal gibt man nun folgendes ein:
```
javac -d . Seq.java UtilPrint.java 
```
Wenn man keine Fehlermeldung bekommt, hat man alles richtig gemacht.


### Ausführen mit GradleW

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

### Ausführen ohne GradleW

Um das Programm nun zu starten benutzt man den Befehl
```
java com.daemonspoint.seq.Seq 10
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

Dieser Vorgang kann auch mit den anderen .java Dateien durchgespielt werden.
- SeqPause.java
- SeqOutErr.java
- SeqPauseOutErr.java
