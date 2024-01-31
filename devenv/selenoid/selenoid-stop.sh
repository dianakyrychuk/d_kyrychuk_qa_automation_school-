#!/bin/sh -x

docker stop selenoid
docker stop selenoid-ui
docker rm selenoid
docker rm selenoid-ui