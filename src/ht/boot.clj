(ns ht.boot
  (:require [ht.gui :as g]
            [clojure.java.io :as io])
  (:import java.io.File)
  (:gen-class
   :name ht.boot.Main))


(defn- create-app-directory-if-not-exists []
  (let [app-directory (io/file (str (System/getProperty "user.home") File/separator ".ht"))]
    (if-not (.exists app-directory)
      (do
        (print (str "Creating app directory in " app-directory ".."))
        (let [created? (.mkdir app-directory)]
          (if created?
            (println ".created successful.")
            (do
              (println "Ups! Can't create app directory [" app-directory "]")
              (System/exit -1))
      ))))))

(defn -main [& args]
  (print args)
  (println "\nIt's a humble start to a great application!")
  (create-app-directory-if-not-exists)
  (g/main-window))


