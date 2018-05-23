package org.woehlke.learn.learnneo4j.frontend.control.closed.terminal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/adm/")
public class TerminalController {

    private final TerminalService terminalService;

    @Autowired
    public TerminalController(TerminalService terminalService) {
        this.terminalService = terminalService;
    }

    @GetMapping("/portinfo/available/fetch")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        String result = "DONE";
        terminalService.getAllAvailablePorts();
        model.addAttribute("result", result);
        return "adm/portinfo/available/fetch";
    }
}