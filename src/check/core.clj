(ns check.core
  (:require [clojure.spec :as s]))

(defn add
  "I don't do a whole lot."
  [x y]
  (+ x y))

(s/fdef add
  :args (s/cat :a integer? :b integer?)
  :ret integer?)
