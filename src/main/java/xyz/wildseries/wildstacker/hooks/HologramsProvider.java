package xyz.wildseries.wildstacker.hooks;

import org.bukkit.Location;
import xyz.wildseries.wildstacker.api.objects.StackedObject;

public interface HologramsProvider {

    void createHologram(StackedObject stackedObject, String line);

    void createHologram(Location location, String line);

    void deleteHologram(StackedObject stackedObject);

    void deleteHologram(Location location);

    void changeLine(StackedObject stackedObject, String newLine, boolean createIfNull);

    void changeLine(Location location, String newLine, boolean createIfNull);

    boolean isHologram(Location location);

    void clearHolograms();

}