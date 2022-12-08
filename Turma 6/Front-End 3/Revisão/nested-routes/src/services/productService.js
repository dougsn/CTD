async function saveProduct(product, token, setError, setLoading) {
  try {
    const response = await api.post(
      "/products",
      { ...product },
      {
        headers: {
          token: token,
        },
      }
    );
  } catch (error) {
    setError(true);
  } finally {
    setLoading(false);
  }
}
