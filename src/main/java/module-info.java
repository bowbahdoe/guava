/**
 * Aggregator Module for dev.mccue.guava.
 */
module dev.mccue.guava {
    requires transitive dev.mccue.guava.base;
    requires transitive dev.mccue.guava.primitives;
    requires transitive dev.mccue.guava.escape;
    requires transitive dev.mccue.guava.math;
    requires transitive dev.mccue.guava.collect;
    requires transitive dev.mccue.guava.xml;
    requires transitive dev.mccue.guava.html;
    requires transitive dev.mccue.guava.graph;
    requires transitive dev.mccue.guava.hash;
    requires transitive dev.mccue.guava.io;
    requires transitive dev.mccue.guava.net;
    requires transitive dev.mccue.guava.reflect;
    requires transitive dev.mccue.guava.concurrent;
}