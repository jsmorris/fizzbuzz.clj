(ns fizzbuzz.core-test
  (:use clojure.test fizzbuzz.core))

(deftest nonefizzbuzz-numbers-return-itself
 (is (= (fizzbuzz '(1 2 4 7)) '(1 2 4 7))))

(deftest multiple-of-three-and-not-five-return-fizz
 (is (= (fizzbuzz '(3 6 9 12 18 21 24 27)) (take 8 (repeat "fizz")) )))

(deftest multiple-of-five-and-not-three-return-buzz
 (is (= (fizzbuzz '(5 10 20 25 40 50 55 65)) (take 8 (repeat "buzz")) )))

(deftest multiple-of-three-and-five-return-fizzbuzz
 (is (= (fizzbuzz '(15 30 45 60 75 90 105 120)) (take 8 (repeat "fizzbuzz")) )))

(deftest three-in-number-returns-fizz
 (is (= (fizzbuzz '(3 13 23 31 103)) (repeat 5 "fizz"))))

(deftest five-in-number-returns-buzz
 (is (= (fizzbuzz '(5 52 58 151 502)) (repeat 5 "buzz"))))

(run-tests)