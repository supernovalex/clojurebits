(defproject python-from-clojure "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clj-python/libpython-clj "2.00-beta-12"]]
  :main python-from-clojure.core
  :repl-options {:init-ns python-from-clojure.core})
