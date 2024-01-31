#!/bin/sh -x

docker run --rm -v /var/run/docker.sock:/var/run/docker.sock -v ${PWD}:/root -e OVERRIDE_HOME=${PWD} aerokube/cm:latest selenoid start --force --browsers-json "./browsers.json" --vnc --args "-limit 10"
docker run -d --name selenoid-ui -p 8080:8080 aerokube/selenoid-ui --selenoid-uri http://172.17.0.1:4444