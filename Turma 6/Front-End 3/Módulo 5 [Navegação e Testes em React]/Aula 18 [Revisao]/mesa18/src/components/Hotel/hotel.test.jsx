import { render, screen } from "@testing-library/react";
import Hotel from "./index";

describe("<Hotel/>", () => {
    test("Verificar se o Hotel está sendo renderizado", () => {
        render(<Hotel/>);

        const nome = screen.getByText("Royal Rio Palace Hotel");

        expect(nome).toBeInTheDocument();
    })
})
