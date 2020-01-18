(ns ht.gui
  (:import (javax.swing JFrame JMenuBar JMenu JMenuItem)
           (java.awt.event ActionListener)
           (javax.swing JOptionPane)))

(defn quit-listener-handler []
  ;; todo: confirmation before quit
  (java.lang.System/exit 1))

(defn about-listener-handler []
  (JOptionPane/showMessageDialog
    nil
    "HealtTracker - easy to use desktop application to track some health metrics."
    "About"
    JOptionPane/INFORMATION_MESSAGE))

(def quit-click-listener (proxy [ActionListener] []
                           (actionPerformed [evt]
                             (quit-listener-handler))))


(def about-click-listener (proxy [ActionListener] []
                            (actionPerformed [evt]
                              (about-listener-handler))))

;; File
(def file-menu (doto (JMenu. "File")
;;                 (.addSeparator)
                 (.add (doto (JMenuItem. "Quit")
                         (.addActionListener quit-click-listener)))))
;; View
(def view-menu (doto (JMenu. "View")))

;; Help
(def help-menu (doto (JMenu. "Help")
                 (.add (JMenuItem. "Help"))
                 (.add (doto (JMenuItem. "About")
                         (.addActionListener about-click-listener)))))


(defn create-menu-bar []
  (let [menu-bar (JMenuBar.)]
    (.add menu-bar ^JMenu file-menu)
    (.add menu-bar ^JMenu view-menu)
    (.add menu-bar ^JMenu help-menu)
    menu-bar))

(defn main-window []
  (let [mw (JFrame. "Healt Tracker v. 0.1-SNAPSHOT")
        mb (create-menu-bar)]
    (.setJMenuBar mw mb)
    (.setSize mw 800 600)
    (.setDefaultCloseOperation mw JFrame/EXIT_ON_CLOSE)
    (.setVisible mw true)))
