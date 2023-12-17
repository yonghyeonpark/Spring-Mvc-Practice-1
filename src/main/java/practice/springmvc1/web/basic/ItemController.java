package practice.springmvc1.web.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import practice.springmvc1.domain.item.Item;
import practice.springmvc1.domain.item.ItemRepository;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/basic/items")
@Controller
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping
    public String items(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "basic/items";
    }
}
