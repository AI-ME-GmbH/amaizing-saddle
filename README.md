Saddle: Scala Data Library
==========================

### Note:
This is a fork of saddle, with a few souped up functions as of right now, particularly,
yank, yankDistinct, yankDistinctM, mapSingleCol and mapColValues, allowing you to map over the values in frames, 
something not present traditionally in saddle.

This fork will evolve separately and diverge significantly in the future, in that it will take upon a much more functional
design in a lot of excepting abstractions and unsafe operations. 

It comes without the hdf5 module, which is also unmaintained.

Introduction
============

Saddle is a data manipulation library for Scala that provides array-backed,
indexed, one- and two-dimensional data structures that are judiciously
specialized on JVM primitives to avoid the overhead of boxing and unboxing.

Saddle offers vectorized numerical calculations, automatic alignment of data
along indices, robustness to missing (N/A) values, and facilities for I/O.

Saddle draws inspiration from several sources, among them the R programming
language & statistical environment, the numpy and pandas Python libraries,
and the Scala collections library.

Documentation
=============
Piggybacking off of the previous docs, they are still relevant.

 - [Docs](http://saddle.github.io/doc/)
 - [Quick Start Guide](http://saddle.github.io/doc/quickstart.html)
 - [scaladoc](http://saddle.github.io/saddle/saddle-core/target/scala-2.9.2/api/#org.package)

License
=======

Saddle is distributed under the Apache License Version 2.0 (see LICENSE file).

Copyright
=========

All forked code is under the apache license. All new code will continue to be under the apache license.
The maintainer(s) of this fork hold no liability, yadda yadda.

All new code doesn't require that ridiculous header nonsense. It's free software, that's all there is to it.
