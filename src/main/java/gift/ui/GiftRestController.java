package gift.ui;

import gift.application.GiftService;
import gift.application.GiveGiftRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gifts")
public class GiftRestController {
    private final GiftService giftService;

    public GiftRestController(final GiftService giftService) {
        this.giftService = giftService;
    }

    @PostMapping
    public void give(@RequestBody GiveGiftRequest request, @RequestHeader("Member-Id") Long memberId) {
        giftService.give(request, memberId);
    }
}