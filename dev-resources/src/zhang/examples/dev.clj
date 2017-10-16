(ns zhang.examples.dev
  (:require [clojure.pprint :refer [print-table]]
            [clojure.tools.namespace.repl :as repl]
            [taoensso.timbre :as log]
            [trifl.java :refer [show-methods]]
            [zhang.examples.core :as examples]
            [zhang.examples.redis :as redis]))

(def reload #'repl/refresh)
