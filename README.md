# java-einlern-projekt

Dies ist das Java-Einlern-Projekt für Mahmud.
Aktuell sind diese Teilprogramme implementiert:


## SeqProgramm

- [SeqProgramm.java](src/main/java/SeqProgramm.java) ... Java-Implementierung vom Linux-Tool `seq`


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

- [Seq.java](src/main/java/Seq.java) ... Java-Implementierung vom Linux-Tool `seq`

### Anforderungen
- "Kompatibel" zu
  - `seq` (Aufruf ohne Argument)
  - `seq 10` (Aufruf mit einem Argument)
  - `seq 2 50` (Aufruf mit zwei Argumenten)
  - `seq 2 3 50` (Aufruf mit drei Argumenten)
- Kompatibel zu Aufrufen mit (teilweise) negativen Argumenten


## SeqPause

-[SeqPause.java](src/main/java/SeqPause.java) ... Java-Implementierung vom Linux-Tool `seq`


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

- [SeqOutErr.java](scr/main/java/SeqOutErr.java) .. Java-Implementierung vom Linux-Tool `seq`


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

- [SeqPauseOutErr.java](scr/main/java/SeqPauseOutErr.java) Java-Implementierung vom Linux-Tool `seq`

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
