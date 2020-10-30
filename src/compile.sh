#!/bin/bash

javac com/prototype/contract/*.java -d compilados/
javac com/prototype/model/*.java -d compilados/
javac com/prototype/factory/*.java -d compilados/
javac com/prototype/client/*.java -d compilados/

java compilados/ com.prototype.client.TestPrototype