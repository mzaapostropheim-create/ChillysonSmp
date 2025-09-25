case "reset":
    player.getActivePotionEffects().forEach(effect -> player.removePotionEffect(effect.getType()));
    player.sendMessage(ChatColor.YELLOW + "✨ Your infusion has been reset!");
    break;
