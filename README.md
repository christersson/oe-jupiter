## OpenEmbedded Build System

This "project" contains all the bits and pieces necessary to build
images without specific board support.  The images can be run with qemu.

<pre>
$ git submodule update --init
$ . ./env
$ bitbake core-image
</pre>
