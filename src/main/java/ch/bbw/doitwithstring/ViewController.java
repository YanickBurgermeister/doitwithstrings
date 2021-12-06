package ch.bbw.doitwithstring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ViewController
 *    Kontrolliert Zusammenspiel mit der View.
 *    Regiert auf Aktionen in der View.
 * @author Peter Rutschmann
 * @version 06.12.2021
 */
@Controller
public class ViewController {

    ViewData viewData = new  ViewData();

    @GetMapping("/")
    public String redirect() {
        return "redirect:/doItWithStrings";
    }

    @GetMapping("/doItWithStrings")
    public String showView(Model model) {
        model.addAttribute("viewData", viewData);
        return "DoItWithStringsForm";
    }

    @PostMapping(value = "/doItWithStrings", params = {"showButton=aufgabe1"})
    public String aufgabe1(Model model, @ModelAttribute("viewData") ViewData viewData) {
        //Aufgabe 1
        System.out.println("ViewController.aufgabe1: " + viewData);
        System.out.println("ViewController.aufgabe1: " + viewData.getString1());
        System.out.println("ViewController.aufgabe1: " + viewData.getString2());
        System.out.println("ViewController.aufgabe1: " + viewData.getString3());
        System.out.println("ViewController.aufgabe1: " + viewData.getResult());

        //Hier implementieren und mit viewData.setResult(..) Ergebnis zuweisen
        // + "\n" macht immer eine neue Zeile
        //Beispiel:
        String ergebnis = viewData.getString1() + "\n"
              + "a) Laenge: " /*hier ergänzen*/ + "\n"
              + "b) Ist Gerade Anzahl: " /*hier ergänzen*/ + "\n"
              + "c) Erster Buchstabe: " /*hier ergänzen*/ + "Letzter Buchstabe: " /*hier ergänzen*/ + "\n";
        viewData.setResult(ergebnis);

        model.addAttribute("viewData", viewData);
        return "DoItWithStringsForm";
    }

    @PostMapping(value = "/doItWithStrings", params = {"showButton=aufgabe2"})
    public String aufgabe2(Model model, @ModelAttribute("viewData") ViewData viewData) {
        System.out.println("ViewController.aufgabe2");
        //Aufgabe 2

        //Hier implementieren und mit viewData.setResult(..) Ergebnis zuweisen
        // viewData.setResult(..

        model.addAttribute("viewData", viewData);
        return "DoItWithStringsForm";
    }

    @PostMapping(value = "/doItWithStrings", params = {"showButton=aufgabe3"})
    public String aufgabe3(Model model, @ModelAttribute("viewData") ViewData viewData) {
        System.out.println("ViewController.aufgabe3");

        model.addAttribute("viewData", viewData);
        return "DoItWithStringsForm";
    }

    @PostMapping(value = "/doItWithStrings", params = {"showButton=aufgabe4"})
    public String aufgabe4(Model model, @ModelAttribute("viewData") ViewData viewData) {
        System.out.println("ViewController.aufgabe4");

        model.addAttribute("viewData", viewData);
        return "DoItWithStringsForm";
    }

    @PostMapping(value = "/doItWithStrings", params = {"showButton=aufgabe5"})
    public String aufgabe5(Model model, @ModelAttribute("viewData") ViewData viewData) {
        System.out.println("ViewController.aufgabe5");

        model.addAttribute("viewData", viewData);
        return "DoItWithStringsForm";
    }

    @PostMapping(value = "/doItWithStrings", params = {"showButton=aufgabe6"})
    public String aufgabe6(Model model, @ModelAttribute("viewData") ViewData viewData) {
        System.out.println("ViewController.aufgabe6");

        model.addAttribute("viewData", viewData);
        return "DoItWithStringsForm";
    }

    @PostMapping(value = "/doItWithStrings", params = {"showButton=aufgabe7"})
    public String aufgabe7(Model model, @ModelAttribute("viewData") ViewData viewData) {
        System.out.println("ViewController.aufgabe7");

        model.addAttribute("viewData", viewData);
        return "DoItWithStringsForm";
    }

    @PostMapping(value = "/doItWithStrings", params = {"showButton=resetView"})
    public String resetView(Model model) {
        viewData = new ViewData();
        model.addAttribute("viewData", viewData);
        return "DoItWithStringsForm";
    }
}
