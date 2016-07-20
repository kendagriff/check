(ns check.core-test
  (:require [clojure.test :refer :all]
            [clojure.spec.test :as stest]
            [check.core :as c]))

(deftest a-test
  (is (true? (-> (stest/check `c/add)
                 (first)
                 (:clojure.spec.test.check/ret)
                 (:result)))))
