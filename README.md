# guava

## What

This package is a fork of [Guava](https://github.com/google/guava) around roughly release `32.1.1` which
* Is shaded under `dev.mccue.guava`
* Has a proper `module-info.java`
* Has all usages of `sun.misc.*` removed

This is an aggregator module and each package of guava has been split into submodules which can be found here

* [dev.mccue.guava.base](https://github.com/bowbahdoe/guava-base)
* [dev.mccue.guava.primitives](https://github.com/bowbahdoe/guava-primitives)
* [dev.mccue.guava.escape](https://github.com/bowbahdoe/guava-escape)
* [dev.mccue.guava.math](https://github.com/bowbahdoe/guava-math)
* [dev.mccue.guava.collect](https://github.com/bowbahdoe/guava-collect)
* [dev.mccue.guava.xml](https://github.com/bowbahdoe/guava-xml)
* [dev.mccue.guava.html](https://github.com/bowbahdoe/guava-html)
* [dev.mccue.guava.graph](https://github.com/bowbahdoe/guava-graph)
* [dev.mccue.guava.hash](https://github.com/bowbahdoe/guava-hash)
* [dev.mccue.guava.io](https://github.com/bowbahdoe/guava-io)
* [dev.mccue.guava.net](https://github.com/bowbahdoe/guava-net)
* [dev.mccue.guava.reflect](https://github.com/bowbahdoe/guava-reflect)
* [dev.mccue.guava.concurrent](https://github.com/bowbahdoe/guava-concurrent)

## Why

* It [doesn't seem like guava will be modularized any time soon](https://github.com/google/guava/issues/2970#issuecomment-1572148291)
* I want to enable more libraries to be fully modular so that the `jlink`
workflow is more viable
* Mechanical refactors are a really easy thing to do to fall asleep. This is how I count sheep.

## Why Not

* The transformation from Guava code to this was not _entirely_ mechanical.
* I did make some small changes to APIs and internals that were Java 8 specific.
* I haven't ported over the unit tests
* GWT, j2objc, j2cl, etc. are not things I care about or want to support.
* Does not include any android specific code. Equivalent to the `-jre` build.
* Compiled for Java 9+, not Java 8
* Does not include
  * `com.google.common.eventbus` (Guava docs explicitly recommends against its use)
  * `com.google.common.cache` ([Caffiene](https://github.com/ben-manes/caffeine) covers that use.)
  * `com.google.common.annotations` (Only `@Beta` and `@VisibleForTesting` would be relevant without GWT+etc. testing, and you can make your own pretty easily.)

## If you have a use for this

<details>
  <summary>Click to expand</summary>


<p>The biggest thing holding this back from being a "reliable" project is that the transformation
from Guava to the subpackages was done manually. If that transformation is scripted (with something like OpenRewrite)
then I could more easily keep this up to date with guava's development and test only the parts I make changes to.</p>

<p>I am willing to do that work, but only if it will genuinely help someone. So reach out to me over discord, reddit, slack, or email. I'm happy enough to stop here
otherwise since I got my fun jlink builds working.</p>

</details>


## Usage

For the most part, you should be able to just find+replace all
references to `com.google.common` with `dev.mccue.guava`.

Consult the [original documentation](https://github.com/google/guava) for
in-depth usage guides.

```xml
<dependency>
    <groupId>dev.mccue</groupId>
    <artifactId>guava</artifactId>
    <version>0.0.2</version>
</dependency>
```