(ns fizbuzz2.core)

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!"))

(defn- numeric-fizz? [n]
  (= (rem n 3) 0))

(defn- string-fizz? [n]
  (some #(= % \3) (str n)))

(defn- fizz? [n]
  (or (numeric-fizz? n) (string-fizz? n)))

(defn- numeric-buzz? [n]
  (= (rem n 5) 0))

(defn- string-buzz? [n]
  (some #(= % \5) (str n)))

(defn- buzz? [n]
  (or (numeric-buzz? n) (string-buzz? n)))

(defn- fizzbuzz? [n]
  (and (fizz? n) (buzz? n)))

(defn- replace-fizz-buzz [n]
  (cond
  (fizzbuzz? n) "fizzbuzz"
    (fizz? n) "fizz"
    (buzz? n) "buzz"
    (number? n) n))

(defn fizzbuzz [numbers]
  (map replace-fizz-buzz numbers))