# Obsolete Abläufe

## Bauen Ohne Graldew

Nach dem man das Repo geklont hat, muss man das Programm zuerst kompilieren, mit ```javac``` und dem argument ```-d```
Als erstes sollte man zunächst in den Ordner wechseln in dem die QuellCodes sind.(src/main/java/com/daemonspoint/seq)  
Im Terminal gibt man nun folgendes ein:
```
cd src/main/java/com/daemonspoint/seq
javac -d . Seq.java UtilPrint.java 
```
Wenn man keine Fehlermeldung bekommt, hat man alles richtig gemacht.

## Ausführen mit Gradlew 

Mit diesem Befehl lässt sich das Projekt ausführen:
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
