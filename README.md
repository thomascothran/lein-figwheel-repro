# Figwheel/CLJ 1.7 Incompatibility

This repository is intended to reproduce a problem in which Figwheel cannot be used with Clojure `1.7`, but does work with Clojure `1.8`.

There are two branches: `1.7` and `1.8`. Here are the tests that I run:

## Tests Used

### Test Clojure 1.7 itself

`lein run` will print the current time. It works on both the `1.7` and `1.8` branch.

## Test with Lien-Figwheel Plugin

`lein do clean, fighweel` will run Figwheel with the `lien-fighweel` plugin on the `1.8` branch but not the `1.7` branch.

### Test without Lien-Figwheel

`lein run -m clojure.main script/figwheel.clj` will run figwheel without the `lien-figwheel` plugin. This works on teh `1.8` branch but not the `1.7` branch.


## Error message

A representative error message is in `error_msg.txt`.

