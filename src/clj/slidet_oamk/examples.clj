(ns slidet-oamk.examples)

(inc 1)

(+ 1 2)

(str "Hello" "World")

(def pizza-dough {:type :dough})

(defn add-pepperoni [pizza]
      (update pizza :ingredients conj :pepperoni))

(comment (add-pepperoni pizza-dough))

(comment (add-pepperoni (add-pepperoni pizza-dough)))

(defn add-pineapple [pizza]
      (update pizza :ingredients conj :pineapple))

(defn add-mexicana-sauce [pizza]
      (update pizza :ingredients conj :mexicana-sauce))

(defn add-jalapeno [pizza]
      (update pizza :ingredients conj :jalapeno))

(comment (-> pizza-dough
	 add-pepperoni
	 add-pineapple
	 add-mexicana-sauce
	 add-jalapeno))

(def many-doughs (repeat 5 pizza-dough))

(comment (into []
	 (comp
	 (map add-pepperoni)
	 (map add-pineapple)
	 (map add-mexicana-sauce)
	 (map add-jalapeno))
	 many-doughs))

(defn wants-garlic?
 [pizza]
 (:wants-garlic? pizza))

(defn wants-garlic [dough]
      (assoc dough :wants-garlic? true))

(def more-doughs (concat (repeat 3 pizza-dough) (repeat 3 (wants-garlic pizza-dough)) (repeat 2 pizza-dough) (repeat 2 (wants-garlic pizza-dough))))

(comment (into []
	 (comp
	 (filter wants-garlic?)
	 (map add-pepperoni)
	 (map add-pineapple)
	 (map add-mexicana-sauce)
	 (map add-jalapeno))
	 more-doughs))

(defn create-pizza-pipeline
      [ingredients]
   (map #(defn (symbol (str "add-" (name %))) [pizza]
   	(update pizza :ingredients conj %) ingredients))

(def players-in-game {:counter-terrorists {:niko :alive
     :aleksib :dead
     :hunter- :alive
     :m0nesy :dead
     :jackz :dead}
     :terrorists {:s1mple :alive
      :electronic :dead
      :b1t :dead
      :boombl4 :dead
      :perfecto :dead}})

(defn bomb-being-defused [action-if-defused players defused-by]
      (if (some? defused-by)
      	  (action-if-defused defused-by)
	  players))

(comment (def action-if-defused (partial (fn [players defuser] (assoc-in players [:counter-terrorists defuser] :dead)))))

(comment (bomb-being-defused action-if-defused players-in-game nil))

(comment (bomb-being-defused action-if-defused players-in-game :niko))

(defn lazy-eval [items1 items2]
   items1)

(comment (lazy-eval (map inc [1 2 3 4 5]) (map println [1 2 3 4 5])))

