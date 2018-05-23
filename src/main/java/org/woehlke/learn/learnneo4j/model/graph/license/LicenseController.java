package org.woehlke.learn.learnneo4j.model.graph.license;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.learn.learnneo4j.model.common.GraphNodeController;

@Controller
@RequestMapping("/graph/license")
public class LicenseController implements GraphNodeController {


    @GetMapping("/all")
    public String findAll(Model model) {
        model.addAttribute("all", licenseService.findAll());
        model.addAttribute("tizle", "License.findAll");
        log.info("/graph/license/all");
        return "graph/license/all";
    }


    private static final Log log = LogFactory.getLog(LicenseController.class);

    private final LicenseService licenseService;

    @Autowired
    public LicenseController(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

}
