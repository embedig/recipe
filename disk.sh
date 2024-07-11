#!/bin/sh
set -x  #echo on
sudo mount -t tmpfs -o size=64G swap ./tmp
sudo chown embedig.embedig tmp/
sudo mount -t auto -o loop ./images/downloads.img ./downloads
sudo mount -t auto -o loop ./images/sstate-cache.img ./sstate-cache
sudo mount -t auto -o loop ./images/xsct.img ./xsct
sudo mount -t auto -o loop ./images/v2024_1.img ./v2024.1
df -h
