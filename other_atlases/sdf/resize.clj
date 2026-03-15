(def atlas (slurp "Game-Icons-mono.atlas"))
(spit (str "Game-Icons-sdf.atlas") (clojure.string/replace atlas #"bounds:([\-0-9]+),([\-0-9]+),([\-0-9]+),([\-0-9]+)" (fn[[_ x y w h]] (str "bounds:"(bit-shift-right (read-string x) 2) ","(bit-shift-right (read-string y) 2) ","(bit-shift-right (read-string w) 2) ","(bit-shift-right (read-string h) 2) ))))
