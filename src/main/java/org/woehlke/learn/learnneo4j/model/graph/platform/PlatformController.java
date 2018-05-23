package org.woehlke.learn.learnneo4j.model.graph.platform;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.learn.learnneo4j.model.common.GraphNodeController;

@Controller
@RequestMapping("/graph/platform")
public class PlatformController implements GraphNodeController {

    @GetMapping("/all")
    public String findAll(Model model) {
        model.addAttribute("all", platformService.findAll());
        model.addAttribute("title", "Platform.findAll");
        log.info("graph/platform/all");
        return "graph/platform/all";
    }


    private static final Log log = LogFactory.getLog(PlatformController.class);

    private final PlatformService platformService;

    @Autowired
    public PlatformController(PlatformService platformService) {
        this.platformService = platformService;
    }
}
