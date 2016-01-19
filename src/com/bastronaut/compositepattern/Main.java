package com.bastronaut.compositepattern;

/**
 * Created by BSijtsma on 19-01-2016.
 */
/*
Meant to treat components the same whether it is part of a structure,
or the whole structure itself. Once done, you can treat individual objects as composite object.

advantage: apply operations to individual and composite objects the same
way. Example: RESTful services GET operations are almost always implemented
with the composite model

The composite pattern is made using a tree structure. You have a root Component
class node, that serves as an abstraction for all components. It declares the
interface for objects inside the composition. A leaf represent the Leaf objects
or nodes inside the composition. Contains all the components methods.

The Composite represents a component that has children, or methods to
manipulate the children. ALso implements all of components methods, but
often delegates it to its children.

In this example: Menu is composite, MenuItem is leaf, MenuComponent is
the component.
 */
public class Main {

}
