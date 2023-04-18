[![CI](https://github.com/daemon-team/java-einlern-projekt/actions/workflows/gradle.yml/badge.svg)](https://github.com/daemon-team/java-einlern-projekt/actions/workflows/gradle.yml)

# java-einlern-projekt

Dies ist das Java-Einlern-Projekt für Mahmud. 
Aktuell sind diese Teilprogramme implementiert:

- [SeqProgramm.java](src/main/java/com/daemonspoint/seq/SeqProgramm.java)... Java-Implementierung vom Linux-Tool `seq` mit Feature Flags
- [Seq.java](src/main/java/com/daemonspoint/seq/Seq.java)... Einfache Java-Implementierung vom Linux-Tool `seq`
- [SeqPause.java](src/main/java/com/daemonspoint/seq/SeqPause.java)... Java-Implementierung vom Linux-Tool `seq` mit Pause zwischen den Ausgaben
- [SeqOutErr.java](src/main/java/com/daemonspoint/seq/SeqOutErr.java)... Java-Implementierung vom Linux-Tool `seq` mit wechselndem Ausgabe-Kanal
- [SeqPauseOutErr.java](src/main/java/com/daemonspoint/seq/SeqPauseOutErr.java)... Java-Implementierung vom Linux-Tool `seq` mit Pause und wechselndem Ausgabe-Kanal

## SeqProgramm

### Anforderungen

- "Kompatibel" zu
  - `seq` (Aufruf ohne Argument)
  - `seq 10` (Aufruf mit einem Argument)
  - `seq 2 50` (Aufruf mit zwei Argumenten)
  - `seq 2 3 50` (Aufruf mit drei Argumenten)
- 1 Sekunde Pause zwischen zwei Ausgaben - abstellbar via FeatureFlag
  - Implementierung an genau einer Stelle!
- Getrennte Ausgabekanäle für gerade/ungerade Zahlen - abstellbar via FeatureFlag
  - Implementierung an genau einer Stelle!
- Kompatibel zu Aufrufen mit (teilweise) negativen Argumenten

### Noch nicht umgesetzte Anforderungen

Die nachfolgenden Anforderungen sollen vorerst nicht umgesetzt werden:

- Fließkommazahlen

## Seq

### Anforderungen
- "Kompatibel" zu
  - `seq` (Aufruf ohne Argument)
  - `seq 10` (Aufruf mit einem Argument)
  - `seq 2 50` (Aufruf mit zwei Argumenten)
  - `seq 2 3 50` (Aufruf mit drei Argumenten)
- Kompatibel zu Aufrufen mit (teilweise) negativen Argumenten


## SeqPause

### Anforderungen
- "Kompatibel" zu
  - `seq` (Aufruf ohne Argument)
  - `seq 10` (Aufruf mit einem Argument)
  - `seq 2 50` (Aufruf mit zwei Argumenten)
  - `seq 2 3 50` (Aufruf mit drei Argumenten)
- Kompatibel zu Aufrufen mit (teilweise) negativen Argumenten
- 1 Sekunde Pause zwischen zwei Ausgaben
  - Implementierung an genau einer Stelle!
  

## SeqOutErr

### Anforderungen
- "Kompatibel" zu
  - `seq` (Aufruf ohne Argument)
  - `seq 10` (Aufruf mit einem Argument)
  - `seq 2 50` (Aufruf mit zwei Argumenten)
  - `seq 2 3 50` (Aufruf mit drei Argumenten)
- Kompatibel zu Aufrufen mit (teilweise) negativen Argumenten
- Getrennte Ausgabekanäle für gerade/ungerade Zahlen
  - Implementierung an genau einer Stelle!


## SeqPauseOutErr.java

### Anforderungen
- "Kompatibel" zu
  - `seq` (Aufruf ohne Argument)
  - `seq 10` (Aufruf mit einem Argument)
  - `seq 2 50` (Aufruf mit zwei Argumenten)
  - `seq 2 3 50` (Aufruf mit drei Argumenten)
- Kompatibel zu Aufrufen mit (teilweise) negativen Argumenten
- 1 Sekunde Pause zwischen zwei Ausgaben
  - Implementierung an genau einer Stelle!   
- Getrennte Ausgabekanäle für gerade/ungerade Zahlen


  - Implementierung an genau einer Stelle!
