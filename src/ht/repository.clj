(ns ht.repository
  (:require
   [clojure.java.io :as io]
   [clojure.java.jdbc :as jdbc]))


(defn database-spec [app-data-directory]
  {:classname   "org.hsqldb.jdbcDriver"
   :subprotocol "hsqldb"
   :subname (str "jdbc:hsqldb:file://" app-data-directory "/data.db")
   :user     "SA"
   :password ""})

;;
;; repository functions
;;
(defn blood-metrics-first-day []
  ;; returns first day with blood metric
  ;; as
  ;; {
  ;;  :day '2020-01-01'
  ;;  :metric {
  ;;     :id 1
  ;;     :metric_date "2020-01-01"
  ;;     :pressure "120 90"
  ;;     :pulse 67
  ;;  }
  ;; }
  ;; TODO: implementation
  nil)

(defn blood-metrics-between [start end]
  ;; returns all blood metrics
  ;; start - java.time.LocalDate -> first day of metrics to show
  ;; end - java.time.LocalDate - last day of metrics to show

  ;; TODO: implementation
  nil)

(defn weight-metrics-between [start end]
  ;; returns weight metrics
  ;; start - java.time.LocalDate -> first day of metrics to show
  ;; end - java.time.LocalDate - last day of metrics to show

  ;; TODO: implementation
  nil)
