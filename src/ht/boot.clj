(ns ht.boot
  (:require [ht.gui :as g])
  (:gen-class
     :name ht.boot.Main))

(defn -main [& args]
  (print args)
  (println "\nIt's a humble start to a great application!")
  (g/main-window))
