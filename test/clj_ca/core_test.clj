(ns clj-ca.core-test
  (:require [clojure [test :refer [deftest is testing]]]
            [clj-ca core]))

(deftest simple-test
  (testing "a simple test"
    (is (= 1 2))))
