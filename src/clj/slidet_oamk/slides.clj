(ns slidet-oamk.slides)

(def introduction
  {:content [[:heading "Functional Programmming is Awesome"] 
             [:list 
              "Some background" 
              "Some practice" 
              "Some tips"]]})

(def who-am-i
  {:content [[:heading "Who am I?"]
             [:list "Jukka Länsineva"
              "Been at Solita for ~3 years"
              "In the industry for some 6+ years now"
              "Bachelor of Science from Oulu University"]
             [:expanding-list "Full-stack Clojurist"
              "Also some Java, JS, what have you..."
              "...but mostly Clojure"]]})

(def i-started
  {:options {:background {:image "ilikecats.jpeg"}}
   :content [[:heading "Games are fun"]
             [:list "Like many, got into programming by writing games"
              "...so like many, got started with imperative programming"
              "C / C++ / C# and the like"
              "Got into FP stuff via web stuff"]]})

(def so-what-is-programming
  {:content [[:heading "So what's programming?"]
             [:list "Computation to achieve some result"
              "Two ways about it"
              "Imperative & Declarative"
              "OOP falls into imperative, FP into declarative"
              "Based on models of Turing machines and Lambda Calculus respectively"]]})

(def turing-machines
  {:content [[:heading "Turing machines?"]
             [:list 
              "Model of computation that operates on a state"
              "The grandfather of imperative systems"
              "Can be used to model a CPU, languages, algorithms... "
              "Turing completeness in programming languages means the language can simulate a Turing machine"]]})

(def lambda-calculus
  {:content [[:heading "Lambda calculus"]
             [:expanding-list 
              "A notation system for computation made by Alonzo Church"
              "It has three things in it!"
              "Symbols, that present values"
              "Abstractions, that present function definitions"
              "Applications, that present ... well, applying a function to an argument"
              "And it can do EVERYTHING"
              "...it also equivalent with Turing machines"
              "So it does everything"]]})

(def you-dont-really-need-all-this
  {:content [[:heading "It's fine!"]
             [:list "You don't really need to do this stuff in your daily life!"
              "It's good to know these things are based on concrete models"
              "The takeaway is that these models are equivalent"]]})

(def what-is-FP
  {:content [[:heading "So what is FP?"] 
             [:expanding-list 
              "FP is basically implementation of Lambda Calculus, just with more stuff defined" 
              "...but all programming languages have functions?" 
              "In FP it's not functions as in programming, but functions as in maths"
              "...uhh"
	      "Historically popular in Academia, but also has Industry uses"
	      "Lisp, Haskell, Erlang, OCaml"
	      "e.g. financial sector likes Haskell or other FP"]]})

(def key-functional-concepts
  {:content [[:heading "Key functional concepts"]
             [:expanding-list "Purity - A function's return value is dependant only on its inputs"
              "First-class functions - passing functions as arguments to other functions"
              "Immutability - Once a value is bound it cannot be changed"
              "Lazy evaluation - Order of execution doesn't matter"
              "Recursion - Iteration via functions invoking themselves"]]})

(def difference-between-FP-and-OOP
  {:content [#_[:heading ""]
             [:sections
              [[:subheading "Functional programming"]
               [:expanding-list
                "The what"
                "I want a Mexicana"
                "Data goes through a series of transformative operations"
                "dough -> add-pepperoni -> add-jalapenos ... -> pizza"
                "... we still have the dough"]]
              [[:subheading "Imperative programming"]
               [:expanding-list                   
                "The how"
                "I want a pizza, put on dough pepperoni, jalapenos, pineapple and mexicana sauce"
                "Data is operated on by code"
                "dough <- add-pepperoni <- add-jalapenos ... = pizza"
                "dough becomes a pizza"]]]]})

(def in-the-end-we-have-pizza
  {:content [[:heading "In the end we have a pizza"]
             [:subheading "Just with slightly different approaches"]
	     [:image "pizzagraph.jpg"]})

(def difference-between-FP-and-OOP-2
  {:content [[:heading "More into nitty gritty"]
             [:sections
              [[:subheading "Functional Programming"]
               [:expanding-list "Immutability"
                "Recursion"
                "Pure functions"
                "Lazy evaluation"
                "Functions, symbols"]]
              [[:subheading "Imperative Programming"]
               [:expanding-list "Mutability"
                "Loops"
                "Naturally effectual"
                "Eager"
                "Classes, objects"]]]
             
             ]})

(def benefits-of-both
  {:content [[:heading "So, which is better?"]
             [:subheading "It depends"]
             [:expanding-list "Functional code tends to be more bitesized"
              "Purity leads to more testable and robust code"
              "So, in theory, less bugs"
              "Mutations tend to be more performant"
              "Immutability is more safe, but can be less performant"
              "Mutations tend to cause bugs from side-effects"
	      "Computers ARE closer to Turing Machines in operation"]]})

(def multi-paradigms
  {:content [[:heading "FP creeping in..."]
  	    [:subheading "Modern multiparadigm languages"]
	    [:text "Scala, Kotlin, Rust, ..."]
	    [:subheading "Inspiration in many modern languages"]
	    [:text "React, lambdas in Java, ..."]}

(def what-do-I-actually-do?
  {:content [[:heading "So what do I actually do?"]
             [:expanding-list
              "In Solita, our FP language of choice is Clojure"
              "You might've actually seen it on our career pages!"
              "I'm in a full-stack Clojure project called Harja"
              "Harja is open source, so you can go make PRs!"]]})

(def what-is-clojure
  {:content [[:heading "What is Clojure?"]
             [:expanding-list "A Lisp variant that works on top of JVM"
              "Runs everywhere Java runs!"
              "JVM is very-well battletested"
              "Can interop with Java libraries and other JVM technologies"
              "Massive ecosystem"
              "...though of course, Log4J2"]]})

(def lisp-cycles
  {:content [[:heading "(lisp)"]
             [:image {:centered? true} "lisp_cycles.png"]
             [:text "(println \"Hello World\")"]]})

(def full-stack-clojure
  {:content [[:heading "Clojure is Full-Stack"]
             [:expanding-list "Clojure + ClojureScript"
              "ClojureScript is Clojure that transpiles to JavaScript"
              "So you can write Front-end code on Clojure"
              "You can interop with JavaScript"
              "With Clojure + ClojureScript you can write code once, use everywhere"
              "Great for e.g. utility functions!"]]})

(def in-fact-this-is-clojure
  {:content [[:heading "In fact"]
             [:subheading "This presentation is written in Clojure"]
             [:text "Let's take a look!"]]})

(def repl-rocks
  {:content [[:heading "REPL sucks!"]
             [:expanding-list "REPL is the Killer App for development"
              "Read-Eval-Print-Loop"
              "Allows you to write code at runtime"
              "Test your code in the real context of your application!"
              "Let's see"]]})

(def who-uses-clojure
  {:content [[:heading "Clojure Users in Finland"]
             [:text "There are some.."]
             [:text "Solita, Metosin, Gofore, Siili, Vincit, YLE, ..."]]})

(def use-functional-patterns-elsewhere
  {:content [[:heading "Be a better programmer!"]
             [:subheading "You can utilize FP concepts!"]
             [:expanding-list 
              "Immutability is a good practice if performance"
              "Write small functions that are easy to test!"
              "Embrace purity"
              "Keep any effectful code (code that affects things outside the function) contained!"]]})

(def get-into-clojure
  {:content [[:heading "How to get in?"]
             [:list 
              "Clojure for the Brave and True - https://www.braveclojure.com/clojure-for-the-brave-and-true/"
              "4Clojure - https://4clojure.oxal.org/"
              "Clojure Koans - https://github.com/functional-koans/clojure-koans"
              "Get Leiningen and start hacking - http://www.leiningen.org"
              "Get this app at - https://github.com/jlansineva/slidet-oamk"
              ]]})

(def thanks
  {:content [[:heading "Thanks!"]
             [:subheading "Hit me up at"]
             [:list "LinkedIn "
              "GitHub @jlansineva (get the source for this presentation)"]
             [:subheading "Check Solita Careers at http://www.solita.fi/careers"]
             ]})
