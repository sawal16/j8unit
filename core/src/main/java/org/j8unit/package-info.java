/**
 * <p>
 * According to the goals of <em><a href="j8unit.org">J8Unit</a></em>, this packages contains base <em>J8Unit</em>
 * components and any required extension of {@code org.junit}' classes.
 * </p>
 *
 * <p>
 * In detail, this package provides the very base <em>J8Unit</em> test class super-interface (
 * {@link org.j8unit.J8UnitTest}) and its subject-under-test (SUT) factory based customisation (
 * {@link org.j8unit.FactoryBasedJ8UnitTest}). {@link org.j8unit.J8UnitTest} and the <em>J8Unit</em> way of utilising
 * {@code interface} {@code default} methods is a key feature of <em>J8Unit.
 * </p>
 *
 * <p>
 * Further, additional assertion methods (see {@link org.j8unit.Assert}) are specified in order to allow lazy generation
 * of failure messages. These assertion methods syntactically base on {@link java.util.function.Supplier} whereas the
 * main benefit is gained when calling these methods using lambda expressions. Any main details can be found within the
 * documentation of {@link org.j8unit.J8UnitTest} and {@link org.j8unit.Assert} respectively.
 * </p>
 *
 * @author Stefan Gasterst&auml;dt, Sascha Zak
 */
package org.j8unit;
