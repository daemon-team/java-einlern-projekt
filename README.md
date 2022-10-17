# java-einlern-projekt

Dies ist das Java-Einlern-Projekt für Mahmud.
Aktuell sind diese Teilprogramme implementiert:

- [SeqProgramm.java](src/main/java/SeqProgramm.java) ... Java-Implementierung vom Linux-Tool `seq`

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
