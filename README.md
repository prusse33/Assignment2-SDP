# Assignment 2 — Factory Method & Abstract Factory

## Topic

Film System

This project demonstrates two creational design patterns:

* Factory Method
* Abstract Factory

The project uses a film-based domain with Action and Comedy film types.

---

# Part A — Factory Method

The Factory Method pattern is used to create different types of films without creating concrete film objects directly in the client code.

## Structure

* `Film` — Product interface
* `ActionFilm` — Concrete Product
* `ComedyFilm` — Concrete Product
* `FilmCreator` — Creator
* `ActionFilmCreator` — Concrete Creator
* `ComedyFilmCreator` — Concrete Creator
* `createFilm()` — Factory Method

## How It Works

`Film` defines the common behavior for all films.

```java
public interface Film {
    void play();
}
```

`ActionFilm` and `ComedyFilm` are concrete implementations of `Film`.

The concrete creators decide which film should be created.

For example:

```java
public class ActionFilmCreator extends FilmCreator {

    @Override
    public Film createFilm() {
        return new ActionFilm();
    }
}
```

The client can use the creator without directly creating the film:

```java
FilmCreator creator = new ActionFilmCreator();
Film film = creator.createFilm();
film.play();
```

---

# Part B — Abstract Factory

The Abstract Factory pattern is used to create families of related film products.

The system contains three product types:

* `Film`
* `Poster`
* `Soundtrack`

There are two product families.

## Action Family

* `ActionFilm`
* `ActionPoster`
* `ActionSoundtrack`

## Comedy Family

* `ComedyFilm`
* `ComedyPoster`
* `ComedySoundtrack`

`FilmFactory` is the Abstract Factory.

```java
public interface FilmFactory {

    Film createFilm();

    Poster createPoster();

    Soundtrack createSoundtrack();
}
```

There are two concrete factories:

* `ActionFilmFactory`
* `ComedyFilmFactory`

For example, `ActionFilmFactory` creates the complete Action family:

```java
public class ActionFilmFactory implements FilmFactory {

    @Override
    public Film createFilm() {
        return new ActionFilm();
    }

    @Override
    public Poster createPoster() {
        return new ActionPoster();
    }

    @Override
    public Soundtrack createSoundtrack() {
        return new ActionSoundtrack();
    }
}
```

The client works through the `FilmFactory` interface:

```java
FilmFactory factory = new ActionFilmFactory();

Film film = factory.createFilm();
Poster poster = factory.createPoster();
Soundtrack soundtrack = factory.createSoundtrack();
```

This creates a consistent family of Action products.

---

# Factory Method vs Abstract Factory

Factory Method creates one type of product.

In this project:

`Film`

Abstract Factory creates a family of related products.

In this project:

`Film + Poster + Soundtrack`

Factory Method delegates the creation of a film to a concrete creator.

Abstract Factory delegates the creation of an entire family of related products to a concrete factory.

---

# Clean Code Principles

## 1. Meaningful Names

Class, method, and variable names clearly describe their purpose.

Before:

```java
Film f = factory.createFilm();
```

After:

```java
Film actionFilm = factory.createFilm();
```

The name `actionFilm` makes the purpose of the variable easier to understand.

---

## 2. Small Methods

Methods are small and perform one specific task.

Example:

```java
@Override
public Film createFilm() {
    return new ActionFilm();
}
```

The `createFilm()` method has only one responsibility: creating a film object.

---

## 3. Single Responsibility

Each class has one main responsibility.

For example, `ActionFilm` represents the behavior of an Action film:

```java
public class ActionFilm implements Film {

    @Override
    public void play() {
        System.out.println("Playing an action film.");
    }
}
```

Object creation is handled separately by `ActionFilmFactory`.

This keeps product behavior and object creation separate.

---

## 4. Consistent Formatting

The project uses the same formatting and method structure throughout the classes.

Example:

```java
@Override
public Poster createPoster() {
    return new ActionPoster();
}

@Override
public Soundtrack createSoundtrack() {
    return new ActionSoundtrack();
}
```

Consistent formatting makes the code easier to read and maintain.

---

## 5. Programming to Interfaces

The client depends on interfaces instead of concrete product classes.

Instead of:

```java
ActionFilm film = new ActionFilm();
```

the client uses:

```java
Film film = factory.createFilm();
```

The same idea is used for the factory:

```java
FilmFactory factory = new ActionFilmFactory();
```

This reduces dependency on concrete implementations and makes the system easier to extend.

---

# Project Structure

```text
src
├── factorymethod
│   ├── Film.java
│   ├── ActionFilm.java
│   ├── ComedyFilm.java
│   ├── FilmCreator.java
│   ├── ActionFilmCreator.java
│   ├── ComedyFilmCreator.java
│   └── FactoryMethodDemo.java
│
└── abstractfactory
    ├── Film.java
    ├── Poster.java
    ├── Soundtrack.java
    ├── ActionFilm.java
    ├── ActionPoster.java
    ├── ActionSoundtrack.java
    ├── ComedyFilm.java
    ├── ComedyPoster.java
    ├── ComedySoundtrack.java
    ├── FilmFactory.java
    ├── ActionFilmFactory.java
    ├── ComedyFilmFactory.java
    └── AbstractFactoryDemo.java